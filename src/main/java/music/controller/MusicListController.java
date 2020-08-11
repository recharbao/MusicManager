package music.controller;

import music.pojo.Song;
import music.pojo.music_list_detail;
import music.pojo.music_list_info;
import music.service.impl.MusicListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MusicListController {
    @Autowired
    MusicListServiceImpl musicListServiceImpl;

    @PostMapping("/showMusicListInfo")
    @ResponseBody
    public List<music_list_detail> search(Integer mlid){

        return musicListServiceImpl.getMusicListInfo(mlid);
    }

    @PostMapping("/judgeLikeOrNot")
    @ResponseBody
    public int[] judgeLikeOrNot(Integer mlid){

        return musicListServiceImpl.judgeLikeOrNot(mlid);
    }

    @PostMapping("/getUserEstablishMusicList")
    @ResponseBody
    public List<music_list_info> getUserEstablishMusicList(Integer uid){

        return musicListServiceImpl.getUserEstablishMusicList(uid);
    }
}

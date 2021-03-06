package music.dao;

import music.pojo.Song;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author lyhADT
 */
@Repository
@Mapper
public interface SongDao {
    /**
     * 获取歌曲ID对应的实体类
     * @param sid　歌曲编号
     * @return 对应的实体类
     */
    @Select("select * from song where sid=#{sid}")
    Song getSongBySid(@Param("sid") Integer sid);

    /**
     * 获取sid的最大值
     * @return sid
     */
    @Select("select max(sid) from song")
    int getMaxSid();
}

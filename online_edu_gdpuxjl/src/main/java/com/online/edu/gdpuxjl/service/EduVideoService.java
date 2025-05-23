package com.online.edu.gdpuxjl.service;

import com.online.edu.gdpuxjl.pojo.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author Kachan
 * @since 2025-04-13
 */
public interface EduVideoService extends IService<EduVideo> {

    //根据课程id删除小节
    public void deleteVideoByCourseId(String id);
    // 根据小节id删除小节
    boolean removeVideo(String videoId);
}

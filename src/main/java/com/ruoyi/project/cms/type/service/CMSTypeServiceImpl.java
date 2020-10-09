package com.ruoyi.project.cms.type.service;

import com.ruoyi.project.cms.type.domain.CMSType;
import com.ruoyi.project.cms.type.mapper.CMSTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 老金
 * @version 1.0
 * 公告类型管理服务实现 - 处理分页查询公告类型
 */
@Service
public class CMSTypeServiceImpl implements ICMSTypeService {

    // 公告类型数据访问接口
    @Autowired
    private CMSTypeMapper typeMapper;

    @Override
    public List<CMSType> selectCMSTypeList(CMSType type) {
        return typeMapper.selectCMSTypeList(type);
    }
}

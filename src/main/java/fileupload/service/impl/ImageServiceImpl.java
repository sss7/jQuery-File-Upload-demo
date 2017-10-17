package fileupload.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import fileupload.entity.Image;
import fileupload.mapper.ImageMapper;
import fileupload.service.ImageService;

@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements ImageService{

}

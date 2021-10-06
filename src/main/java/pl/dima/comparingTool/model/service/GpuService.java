package pl.dima.comparingTool.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dima.comparingTool.model.entity.GpuEntity;
import pl.dima.comparingTool.model.repository.GpuRepository;

@Service
public class GpuService {
    @Autowired
    GpuRepository gpuRepository;

    public Iterable<GpuEntity> getAllGpus(){return gpuRepository.findAll();}
}

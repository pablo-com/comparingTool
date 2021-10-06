package pl.dima.comparingTool.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dima.comparingTool.model.entity.GpuEntity;

import java.util.List;

@Repository
public interface GpuRepository extends CrudRepository<GpuEntity, Integer> {
    @Query(nativeQuery = true, value = "select * from gpu_list;")
    List<GpuEntity> findAll();
}

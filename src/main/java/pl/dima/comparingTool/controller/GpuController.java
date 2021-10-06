package pl.dima.comparingTool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.dima.comparingTool.model.entity.GpuEntity;
import pl.dima.comparingTool.model.repository.GpuRepository;
import pl.dima.comparingTool.model.service.GpuService;

import java.util.Collections;
import java.util.List;

@Controller
public class GpuController {
    @Autowired
    GpuService gpuService;
    @Autowired
    GpuRepository gpuRepository;

    @GetMapping("gpuList")
    public String gpuList(Model model){
        List<GpuEntity>GpuList = gpuRepository.findAll();
        Collections.sort(
                GpuList,
                (player1, player2) -> player1.getMemory()
                        - player2.getMemory());

        GpuList.forEach(System.out::println);

        model.addAttribute("gpuList",GpuList);
        return "gpuList";
    }
}

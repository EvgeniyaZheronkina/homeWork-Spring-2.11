package pro.sky.homeWorkSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeWorkSpring.service.StoreService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/store")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("item") List<Long> item) {
        storeService.add(item);
    }

    @GetMapping("/get")
    public Set<Long> get(){
        return storeService.getAll();
    }
}


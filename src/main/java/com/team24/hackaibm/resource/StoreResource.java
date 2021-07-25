package com.team24.hackaibm.resource;

import com.team24.hackaibm.model.representationModel.NewItemRepresentationModel;
import com.team24.hackaibm.model.representationModel.StoreRepresentationModel;
import com.team24.hackaibm.service.StoreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/store")
@CrossOrigin(origins = "*")
public class StoreResource {

    @Autowired
    StoreService storeService;

    //CREATE
    @PostMapping
    @ApiOperation("Create item into store")
    public ResponseEntity<NewItemRepresentationModel> create(@RequestBody NewItemRepresentationModel item){
        return ResponseEntity.ok(storeService.create(item));
    }

    //GET ALL
    @GetMapping
    @ApiOperation("Get all itens from store")
    public ResponseEntity<StoreRepresentationModel> getAll(){
        return ResponseEntity.ok(storeService.getAll());
    }
}

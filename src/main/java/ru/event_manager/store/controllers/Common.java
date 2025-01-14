package ru.event_manager.store.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.event_manager.store.dto.CommonDto;

import java.util.List;

@RequestMapping(value = "/api")
@RestController
//@NoArgsConstructor
//@AllArgsConstructor
@Slf4j
public class Common {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<CommonDto> saveUser() {
        CommonDto commonDto = new CommonDto();
        commonDto.setName("SimpleName");
        log.info("Save user: {}", commonDto);
        return new ResponseEntity<>(commonDto, HttpStatus.OK);
    }
}

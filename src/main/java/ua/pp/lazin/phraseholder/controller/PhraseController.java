package ua.pp.lazin.phraseholder.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ua.pp.lazin.phraseholder.entity.Phrase;
import ua.pp.lazin.phraseholder.service.PhraseService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ruslan Lazin
 */
@EnableWebMvc
@RestController
public class PhraseController {

    @Autowired
    private PhraseService phraseService;

    @RequestMapping("/phrases")
    public String getAllPhrases() {
        return "phrases";
    }

    @RequestMapping("/add")
    public ResponseEntity addPhrase() {
        ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        return responseEntity;
    }

    @RequestMapping(value = "/la", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> getAll() {
        System.out.println("la"); //todo  remove
        List<JSONObject> entities = phraseService.getAll();
        return new ResponseEntity<Object>(entities, HttpStatus.OK);
    }
}

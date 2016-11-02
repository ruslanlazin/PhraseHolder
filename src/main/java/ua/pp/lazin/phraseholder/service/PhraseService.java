package ua.pp.lazin.phraseholder.service;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import ua.pp.lazin.phraseholder.entity.Phrase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ruslan Lazin
 */

@Component
public class PhraseService {

    public List<JSONObject> getAll() {
//        List<Phrase> entityList = entityManager.findAll();

        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
        for (int i = 0; i < 10; i++) {
            JSONObject entity = new JSONObject();
            entity.put("id", "10");
            entity.put("address", "potapova");
            jsonObjects.add(entity);
        }
        return jsonObjects;
    }
}
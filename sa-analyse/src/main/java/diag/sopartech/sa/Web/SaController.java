package diag.sopartech.sa.Web;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "sa" , produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping
    public List <Object> search(){
        return Arrays.asList(new Sa(1,"Belle formation",1),new Sa(2,
                "Belle Collection",3));
    }
 }

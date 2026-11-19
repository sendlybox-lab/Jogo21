package br.com.jogo21;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {

    GeradorCartas gerador = new GeradorCartas();
    int totalJogador = 0;
    int totalDealer = 0;
    boolean jogoAtivo = false;

    @PostMapping("/iniciar")
    public Map<String, Object> iniciar() {
        totalJogador = 0;
        totalDealer = 0;
        jogoAtivo = true;
        Map<String, Object> resposta = new HashMap<>();
        resposta.put("totalJogador", 0);
        return resposta;
    }
}

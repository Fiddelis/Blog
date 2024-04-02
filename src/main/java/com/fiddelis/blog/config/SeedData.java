package com.fiddelis.blog.config;

import com.fiddelis.blog.models.Article;
import com.fiddelis.blog.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private ArticleService articleService;

    @Override
    public void run(String... args) throws Exception {
        List<Article> articles = articleService.getAll();

        if(articles.isEmpty()) {
            Article article1 = new Article();
            article1.setTitle("Titulo do Primeiro Post");
            article1.setBody("O H2 é um sistema de gerenciamento de banco de dados relacional (SGBDR) bastante utilizado, especialmente em desenvolvimento e ambientes de teste devido à sua simplicidade de configuração e uso. No entanto, como qualquer software, ele também pode apresentar uma série de problemas, incluindo:\n" +
                    "<br><br>" +
                    "Concorrência: Em ambientes com muitos acessos simultâneos, podem ocorrer problemas de concorrência, como deadlocks e bloqueios prolongados.\n" +
                    "<br><br>" +
                    "Desempenho: Dependendo do volume de dados e da complexidade das consultas, o desempenho do banco de dados pode diminuir. O ajuste de índices e consultas pode ser necessário para otimizar o desempenho.\n" +
                    "<br><br>" +
                    "Corrupção de dados: Embora seja raro, bugs ou falhas no software podem levar à corrupção dos dados armazenados no banco de dados.\n" +
                    "<br><br>" +
                    "Problemas de segurança: Se o H2 não for configurado corretamente, pode estar vulnerável a ataques de segurança, como injeção de SQL ou acesso não autorizado.\n" +
                    "<br><br>" +
                    "Limitações de escalabilidade: O H2 pode ter limitações de escalabilidade em comparação com outros SGBDRs, o que pode se tornar um problema em sistemas que precisam escalar para lidar com grandes volumes de dados ou muitos usuários simultâneos.\n" +
                    "<br><br>" +
                    "Backup e recuperação: A implementação de estratégias de backup e recuperação inadequadas pode levar à perda de dados em caso de falha do sistema.\n" +
                    "<br><br>" +
                    "Compatibilidade com outros sistemas: Algumas funcionalidades específicas de outros SGBDRs podem não ser suportadas pelo H2, o que pode levar a problemas de compatibilidade ao migrar ou integrar sistemas.\n" +
                    "<br><br>" +
                    "Problemas de configuração: Configurações inadequadas do H2 podem levar a problemas de desempenho, segurança ou mesmo inoperância do banco de dados.\n" +
                    "<br><br>" +
                    "Gerenciamento de memória: Configurar a alocação de memória correta para o H2 pode ser crucial para o desempenho e estabilidade do sistema. Configurações inadequadas podem levar a vazamentos de memória ou queda no desempenho.\n" +
                    "<br><br>" +
                    "Problemas de transação: Erros na implementação de transações podem levar a inconsistências nos dados ou perda de integridade.\n" +
                    "<br><br>" +
                    "É importante entender esses possíveis problemas ao trabalhar com o H2 e implementar práticas de desenvolvimento e administração que ajudem a minimizar esses riscos. Além disso, estar ciente das atualizações de segurança e correções de bugs fornecidas pelos desenvolvedores do H2 é fundamental para manter um ambiente de banco de dados seguro e estável.");

            Article article2 = new Article();
            article2.setTitle("Titulo do Segundo Post");
            article2.setBody("TEXTAAAAAAAAAAAAAAAAAAA");

            articleService.save(article1);
            articleService.save(article2);
        }
    }
}

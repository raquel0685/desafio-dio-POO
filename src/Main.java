import br.com.dio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        //exemplo polimorfismo: Conteudo curso3 = new Curso();
        //Conteudo mentoria = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setDataFormatada();
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudosBootcamp().add(curso1);
        bootcamp.getConteudosBootcamp().add(curso2);
        bootcamp.getConteudosBootcamp().add(mentoria1);

        Dev devEu = new Dev();
        devEu.setNome("Eu");
        devEu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Eu " + devEu.getConteudosInscritos());
        devEu.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos de Eu " + devEu.getConteudosConcluidos());
        System.out.println("Data de conclusão de Eu " + bootcamp.getDataFinalFormatada());
        System.out.println("Conteúdos Inscritos de Eu " + devEu.getConteudosInscritos());
        System.out.println("XP de Eu " + devEu.calcularTotalXp());
        devEu.progredir();
        System.out.println("Conteúdos Concluídos de Eu " + devEu.getConteudosConcluidos());
        System.out.println("Data de conclusão de Eu " + bootcamp.getDataFinalFormatada());
        System.out.println("Conteúdos Inscritos de Eu " + devEu.getConteudosInscritos());
        System.out.println("XP de Eu " + devEu.calcularTotalXp());

        System.out.println("**********");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos de João " + devJoao.getConteudosConcluidos());
        System.out.println("Data de conclusão de João " + bootcamp.getDataFinalFormatada());
        System.out.println("Conteúdos Inscritos de João " + devJoao.getConteudosInscritos());
        System.out.println("XP de Eu " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos de João " + devJoao.getConteudosConcluidos());
        System.out.println("Data de conclusão de João " + bootcamp.getDataFinalFormatada());
        System.out.println("Conteúdos Inscritos de João " + devJoao.getConteudosInscritos());
        System.out.println("XP de Eu " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos de João " + devJoao.getConteudosConcluidos());
        System.out.println("Data de conclusão de João " + bootcamp.getDataFinalFormatada());
        System.out.println("Conteúdos Inscritos de João " + devJoao.getConteudosInscritos());
        System.out.println("XP de Eu " + devJoao.calcularTotalXp());

    }
}

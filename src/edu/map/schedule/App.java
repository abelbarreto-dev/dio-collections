package edu.map.schedule;

public class App {
    public static void main(String[] args) {
        var agenda = new ScheduleContacts();

        agenda.adicionarContato("abel", 5552);
        agenda.adicionarContato("jorge", 4611);
        agenda.adicionarContato("paulo", 1144);

        agenda.exibirContatos();

        agenda.removerContato("paulo");

        agenda.exibirContatos();

        agenda.adicionarContato("abel", 1122);

        agenda.exibirContatos();

        agenda.adicionarContato("pedro", 2255);

        agenda.exibirContatos();

        System.out.println("telefone abel? " + agenda.pesquisarContato("abel"));
        System.out.println("telefone natan? " + agenda.pesquisarContato("natan"));
    }
}

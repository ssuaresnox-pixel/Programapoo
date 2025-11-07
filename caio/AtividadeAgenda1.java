public class AtividadeAgenda1 {
    public static void main(String[] args) {
        Contact contato01 = new Contact("Goku", "goku@gmail.com", "(69) 9123-4567");
        Contact contato02 = new Contact("Vegeta", "vegeta@gmail.com", "(69) 9123-4568");
        Contact contato03 = new Contact("Mulher Maravilha", "mulher.maravilha@gmail.com", "(69) 9123-4569");



        Agenda agenda = new Agenda();

        agenda.addContact(contato01); 
        agenda.addContact(contato02);
        agenda.addContact(contato03);

        agenda.printContacts();

        agenda.removeContactByIndex(1);
        agenda.printContacts();

        Contact contato04 = new Contact("Gohan", "gohan@gmail.com", "(11) 9439-4934");

        agenda.addContact(contato04);

        agenda.printContact(agenda.findContactByName("Gohan "));
        agenda.printContact(1);

        agenda.removeContactByName("Gohan ");
    }
}
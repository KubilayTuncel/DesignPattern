package BehavioralDP.MediatorDP;

public class MediatorRunner {

    public static void main(String[] args) {

        //Bu sistemin aynisini (danismanlik ve dagitici sisteminin)
        // SpringBoot ta handler Mapping'de kullaniliyoruz.
        MediatorRunner mediator = new MediatorRunner();

        mediator.mediatorDemo();

    }


    void mediatorDemo(){

        MessageDispatcher dispatcher = new MessageDispatcher(); //danisman

        Actor actor1 = new MessageActor("Actor 1",dispatcher);
        Actor actor2 = new MessageActor("Actor 2",dispatcher);
        Actor actor3 = new MessageActor("Actor 3",dispatcher);
        Actor actor4 = new MessageActor("Actor 4",dispatcher);

        //Actorlerimi kaydettim
        dispatcher.register("topic 1",actor1);
        dispatcher.register("topic 2",actor2);
        dispatcher.register("topic 3",actor3);
        dispatcher.register("topic 4",actor4);

        //actor1 3 tane soru sordu danismana
        actor1.sendMessage("topic 2","Message for topic 2");
        actor1.sendMessage("topic 3","Message for topic 3");
        actor1.sendMessage("topic 4","Message for topic 4");

    }
}

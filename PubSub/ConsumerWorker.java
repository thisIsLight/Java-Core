package PubSub;

public class ConsumerWorker implements Runnable {

    private IConsumer currentConsumer;
    private Topics currentTopic;
    private int offSet = 1;
    private boolean keepAlive = true;


    

    public ConsumerWorker(IConsumer consumer, Topics topic) {
        super();
        currentConsumer = consumer;
        currentTopic = topic;
    }

    @Override
    public void run() {
        while(keepAlive){
            System.out.println("TOp : " + currentTopic.getQueue().size() + " -- "+ offSet);
            while(currentTopic.getQueue().size() <= offSet){
                try{
                    wait();
                }
                catch(Exception e){

                }
            }

            System.out.println("Bottom : " + currentTopic.getQueue().size() + " --"+ offSet);

            var messageToConsume = currentTopic.getQueue().get(offSet);
            currentConsumer.consume(messageToConsume);
            offSet++;
        }
    }
    
}

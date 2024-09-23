package PubSub;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Topics {
    
    private List<String> queue = new ArrayList<String>();
    private Hashtable<String, ConsumerWorker> consumers = new Hashtable<String, ConsumerWorker>();

    public void Subscribe(IConsumer consumer) {
        if(!consumers.containsKey(consumer.getName())){
            ConsumerWorker worker = new ConsumerWorker(consumer, this); 
            Thread workerThread = new Thread(worker);
            System.out.println("Here");
            workerThread.start();
            consumers.put(consumer.getName(), worker);
        }
    }
    public void UnSubscribe(IConsumer consumer) {
        if(consumers.containsKey(consumer.getName())){
            consumers.remove(consumer.getName());
        }
    }

    public void Publish(String message){
        queue.add(message);
        // var workers = consumers.values();
        // for(ConsumerWorker worker : workers){
        //     worker.notify();
        // }
    }
    public List<String> getQueue() {
        return queue;
    }

}

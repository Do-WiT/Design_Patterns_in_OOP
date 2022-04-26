import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone {
    public State currentState = State.STANDBY;
    public State exitState = State.STOP;
    public Map<State, List<Pair<Trigger, State>>> rules = new HashMap<>();

    public Phone() {
        rules.put(State.STANDBY, List.of(
                new Pair<>(Trigger.CALL_DIALED, State.CONNECTING),
                new Pair<>(Trigger.STOP_USING_PHONE, State.STOP)
        ));
        rules.put(State.CONNECTING, List.of(
                new Pair<>(Trigger.CALL_CONNECTED, State.CONNECTED),
                new Pair<>(Trigger.HUNG_UP, State.STANDBY)
        ));
        rules.put(State.CONNECTED, List.of(
                new Pair<>(Trigger.PLACED_ON_HOLD, State.ON_HOLD),
                new Pair<>(Trigger.HUNG_UP, State.STANDBY)
        ));
        rules.put(State.ON_HOLD, List.of(
                new Pair<>(Trigger.TAKEN_OFF_HOLD, State.CONNECTING),
                new Pair<>(Trigger.HUNG_UP, State.STANDBY)
        ));
    }


}

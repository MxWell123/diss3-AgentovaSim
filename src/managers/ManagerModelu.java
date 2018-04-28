package managers;

import OSPABA.*;
import simulation.*;
import agents.*;
import continualAssistants.*;

//meta! id="1"
public class ManagerModelu extends Manager {

    public ManagerModelu(int id, Simulation mySim, Agent myAgent) {
        super(id, mySim, myAgent);
        init();
    }

    @Override
    public void prepareReplication() {
        super.prepareReplication();
        // Setup component for the next replication

        if (petriNet() != null) {
            petriNet().clear();
        }
    }

	//meta! sender="AgentOkolia", id="98", type="Notice"
	public void processPrichodZakaznikaTerm2(MessageForm message) {
        message.setAddressee(Id.agentSpolocnosti);
        notice(message);
    }

	//meta! sender="AgentOkolia", id="27", type="Notice"
	public void processPrichodZakaznikaTerm1(MessageForm message) {
        message.setAddressee(Id.agentSpolocnosti);
        notice(message);
    }

	//meta! sender="AgentOkolia", id="100", type="Notice"
	public void processPrichodZakaznikaNaVratenieAuta(MessageForm message) {
        message.setAddressee(Id.agentSpolocnosti);
        notice(message);
    }

	//meta! userInfo="Process messages defined in code", id="0"
	public void processDefault(MessageForm message) {
        throw new UnsupportedOperationException("Vykonal sa default v ManagerModelu.");
    }

	//meta! userInfo="Generated code: do not modify", tag="begin"
	public void init()
	{
            MessageForm message = new MyMessage(_mySim);
            message.setAddressee(Id.agentSpolocnosti);
            message.setCode(Mc.initPrichodMinibusov);
            notice(message);
	}

	@Override
	public void processMessage(MessageForm message)
	{
		switch (message.code())
		{
		case Mc.prichodZakaznikaTerm1:
			processPrichodZakaznikaTerm1(message);
		break;

		case Mc.prichodZakaznikaNaVratenieAuta:
			processPrichodZakaznikaNaVratenieAuta(message);
		break;

		case Mc.prichodZakaznikaTerm2:
			processPrichodZakaznikaTerm2(message);
		break;

		default:
			processDefault(message);
		break;
		}
	}
	//meta! tag="end"

    @Override
    public AgentModelu myAgent() {
        return (AgentModelu) super.myAgent();
    }

}
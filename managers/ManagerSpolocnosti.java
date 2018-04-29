package managers;

import OSPABA.*;
import simulation.*;
import agents.*;
import continualAssistants.*;
import instantAssistants.*;

//meta! id="38"
public class ManagerSpolocnosti extends Manager
{
	public ManagerSpolocnosti(int id, Simulation mySim, Agent myAgent)
	{
		super(id, mySim, myAgent);
		init();
	}

	@Override
	public void prepareReplication()
	{
		super.prepareReplication();
		// Setup component for the next replication

		if (petriNet() != null)
		{
			petriNet().clear();
		}
	}

	//meta! sender="AgentMinibus", id="101", type="Request"
	public void processNastupZakaznikovZObsluhyAgentMinibus(MessageForm message)
	{
	}

	//meta! sender="AgentObsluhy", id="158", type="Notice"
	public void processNastupZakaznikovZObsluhyAgentObsluhy(MessageForm message)
	{
	}

	//meta! sender="AgentMinibus", id="50", type="Notice"
	public void processVystupZakaznikaDoObsluhy(MessageForm message)
	{
	}

	//meta! sender="AgentMinibus", id="203", type="Notice"
	public void processVystupZakaznikaTerm3(MessageForm message)
	{
	}

	//meta! sender="AgentModelu", id="42", type="Notice"
	public void processPrichodZakaznikaTerm2(MessageForm message)
	{
	}

	//meta! sender="AgentMinibus", id="71", type="Request"
	public void processNastupZakaznikovTerm2AgentMinibus(MessageForm message)
	{
	}

	//meta! sender="AgentPrichodov", id="62", type="Response"
	public void processNastupZakaznikovTerm2AgentPrichodov(MessageForm message)
	{
	}

	//meta! sender="AgentMinibus", id="55", type="Request"
	public void processNastupZakaznikovTerm1AgentMinibus(MessageForm message)
	{
	}

	//meta! sender="AgentPrichodov", id="61", type="Response"
	public void processNastupZakaznikovTerm1AgentPrichodov(MessageForm message)
	{
	}

	//meta! sender="AgentModelu", id="41", type="Notice"
	public void processPrichodZakaznikaTerm1(MessageForm message)
	{
	}

	//meta! sender="AgentModelu", id="43", type="Notice"
	public void processPrichodZakaznikaNaVratenieAuta(MessageForm message)
	{
	}

	//meta! sender="AgentModelu", id="44", type="Notice"
	public void processInitPrichodMinibusov(MessageForm message)
	{
	}

	//meta! userInfo="Process messages defined in code", id="0"
	public void processDefault(MessageForm message)
	{
		switch (message.code())
		{
		}
	}

	//meta! userInfo="Generated code: do not modify", tag="begin"
	public void init()
	{
	}

	@Override
	public void processMessage(MessageForm message)
	{
		switch (message.code())
		{
		case Mc.nastupZakaznikovTerm1:
			switch (message.sender().id())
			{
			case Id.agentMinibus:
				processNastupZakaznikovTerm1AgentMinibus(message);
			break;

			case Id.agentPrichodov:
				processNastupZakaznikovTerm1AgentPrichodov(message);
			break;
			}
		break;

		case Mc.nastupZakaznikovZObsluhy:
			switch (message.sender().id())
			{
			case Id.agentMinibus:
				processNastupZakaznikovZObsluhyAgentMinibus(message);
			break;

			case Id.agentObsluhy:
				processNastupZakaznikovZObsluhyAgentObsluhy(message);
			break;
			}
		break;

		case Mc.prichodZakaznikaTerm2:
			processPrichodZakaznikaTerm2(message);
		break;

		case Mc.prichodZakaznikaTerm1:
			processPrichodZakaznikaTerm1(message);
		break;

		case Mc.vystupZakaznikaDoObsluhy:
			processVystupZakaznikaDoObsluhy(message);
		break;

		case Mc.prichodZakaznikaNaVratenieAuta:
			processPrichodZakaznikaNaVratenieAuta(message);
		break;

		case Mc.initPrichodMinibusov:
			processInitPrichodMinibusov(message);
		break;

		case Mc.vystupZakaznikaTerm3:
			processVystupZakaznikaTerm3(message);
		break;

		case Mc.nastupZakaznikovTerm2:
			switch (message.sender().id())
			{
			case Id.agentMinibus:
				processNastupZakaznikovTerm2AgentMinibus(message);
			break;

			case Id.agentPrichodov:
				processNastupZakaznikovTerm2AgentPrichodov(message);
			break;
			}
		break;

		default:
			processDefault(message);
		break;
		}
	}
	//meta! tag="end"

	@Override
	public AgentSpolocnosti myAgent()
	{
		return (AgentSpolocnosti)super.myAgent();
	}

}
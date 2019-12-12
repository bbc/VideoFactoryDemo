package uk.co.bbc.videofactorydemo;

import me.acdean.factory.Component;
import me.acdean.factory.Factory;

public class Sponge extends Component {
    public static final String NAME = "Sponge";

    public Sponge(Factory factory, int x, int y) {
        super(factory, x, y, NAME);
        addInput(Loofah.NAME);
    }

    @Override
    public void processMessage() {
        Factory.logger.info("Sponge ProcessMessage");
        addAction(Action.WRITE_TO_S3, 30);
        addAction(Action.EMIT, 1);
        Factory.logger.info("Actions: [{}]", actions.size());
    }
}

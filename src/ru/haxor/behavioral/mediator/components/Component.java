package ru.haxor.behavioral.mediator.components;

import ru.haxor.behavioral.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}

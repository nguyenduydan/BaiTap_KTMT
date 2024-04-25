package structural.decorator.tokenize;

import java.util.List;

public abstract class TokenizeDecorator implements MyTokenize{
    MyTokenize token;

    public TokenizeDecorator(MyTokenize token) {
        this.token = token;
    }
}

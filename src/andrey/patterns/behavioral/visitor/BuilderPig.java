package andrey.patterns.behavioral.visitor;

public interface BuilderPig {

        public void build(Brick brick);

        public void build(Wood wood);

        public void build(Straw straw);
    }



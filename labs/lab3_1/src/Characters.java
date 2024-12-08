public abstract class Characters {

    protected String Name;
    protected IWriter Writer;
    public abstract void WriteAction(IAction act);

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Characters others = (Characters) obj;
        return this.Name == others.Name;
    }

    public int hashCode() {
        return this.Name.hashCode() * this.Writer.hashCode();
    }

    public String toString() {
        return this.Name;
    }


}

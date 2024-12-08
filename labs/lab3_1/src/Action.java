public abstract class Action implements IAction {
    public abstract Actions GetAction();
    public abstract String DoAction();
    public Integer Food_count() {
        return 0; // Значение по умолчанию для всех действий
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Action other = (Action) obj;
        return this.DoAction() == other.DoAction() && this.GetAction() == other.GetAction();

    }

    @Override
    public int hashCode() {
        return this.GetAction().hashCode() * this.DoAction().hashCode();
    }

    @Override
    public String toString() {
        return this.DoAction();
    }
}

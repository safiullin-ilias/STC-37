package HW_7;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isWorker;

    public static Builder builder()
    {
        return new Builder();
    }
    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.isWorker = builder.isWorker;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + " let, " + (isWorker ? "rabo4iy" : "tuniyadets");
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private boolean isWorker;

        public Builder firstName(String firstName)  {   this.firstName = firstName; return this;    }
        public Builder lastName(String lastName)    {   this.lastName = lastName;   return this;    }
        public Builder age(int age)                 {   this.age = age;             return this;    }
        public Builder isWorker(boolean isWorker)   {   this.isWorker = isWorker;   return this;    }

        public User build() {
            return new User(this);
        }
    }
}

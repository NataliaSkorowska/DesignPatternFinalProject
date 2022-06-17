package com.company;

public class Animal implements Visitable{
        private String nameOfAnimal;
        private String healthStatus;

        public Animal( String nameOfAnimal ) {
            super();
            this.nameOfAnimal = nameOfAnimal;
        }

        public String getName()
        {
            return nameOfAnimal;
        }
        public String getHealthStatus()
        {
            return healthStatus;
        }
        public void setHealthStatus( String healthStatus )
        {
            this.healthStatus = healthStatus;
        }
        @Override
        public void accept( Visitor visitor )
        {
            visitor.visit(this);
        }
}

package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {
        public static SessionFactory buildSession() {
            return  new Configuration().configure().buildSessionFactory();
        }
}

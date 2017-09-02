# Hibernate
This repository contains the examples based on xml & annotation configurations for hibernate. Contains examples on various concepts in hibernate.

1. Hibernate Pojo lifecycle:
    transient- newly created object, not assocoated with any session and so with any database
    persistent- linked with a unique session
    detached- once session is closed object  is in detached state 

2. To change the state of pojo object from detached to persistent
   Just open a new session , begin the transaction.
   the object will be in persistent object.
   
3. No need to begin transction for loading object  from database.

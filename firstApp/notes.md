# 10.05.

    1, mvn dependency

    2, javax.validation.constraints

    3, Validation implementations

    4, Give the validation rules

    +Exceptions generating in the background


### Solid Principals:

    SRP - Single Responsibility Principle.
    One purpose
    
    OCP - Open/Closed Principle.
    Later on you can't change your class, you can extend the original class
    and then refactore it

    LSP - Liskov Substitution Principle.
    If you overrid an existing method, your method must be luzyier(lazább)
    Overriding a method is not good. Implemnetion over extendsen
    
    ISP - Interface Segregation Principle.
    Use interface, you don't know what the code will do    

    DIP - Dependency Inversion Principle.

##10.17.

    class A {
        private B b
        #1 - Konstruktor- mező final
        #2 -SetB();
    }

    class A {
        private InterFaceB b
        #1 - Konstruktor- mező final
    }

Spring injection:

1, In data (@Autowired)

2, Setter method:
    
    @Autowired
    void setB(B b){
        this.b = b
    }

3, Constructor

    void A (B b){
        this.b = b;
    }
Lombok @RequiredArgsConstructor  

Class -> Managed Bean

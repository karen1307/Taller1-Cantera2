# Taller1-Cantera2
Se entrega taller 1 de las 6 clases solicitadas.
Titulo: Taller Manejo de clases y Objetos de java
Este taller se solicitaba hacar 6 clases 3 ya establecidas por el profesor y 3 crados por mi.
Descripcion de las clases:
1. Person
atributos:name:String(public),lastName1:String(public),lasName2:String(public),dateBirth:Date(public),Height:Floar(public);
metodos:
    /* obtener nombre*/
    public String getName() {
        return name;
    }
    /* asignar nombre*/
    public void setName(String name) {
        this.name = name;
    }
    /* obtener primer apellido*/
    public String getLastName1() {
        return lastName1;
    }
    /* asignar primer apellido*/
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /* obtener segundo apellido*/
    public String getLastName2() {
        return lastName2;
    }
    /* asignar segundo apellido*/
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /* obtener fecha de nacimiento*/
    public Date getDateBirth() {
        return dateBirth;
    }
    /* asignar fecha de nacimiento*/
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    /*obtener estatura*/
    public float getHeight() {
        return height;
    }
    /* asignar estatura*/
    public void setHeight(float height) {
        this.height = height;
    }
    
2. Fruit
  atribuctos:name:String(public),avergeWeight:Float(floant),ArrayList<String>(public);
  metodos:
   /* obtener nombre de la fruta*/
    public String getName() {
        return name;
    }
    /* asignar nombre de la fruta*/
    public void setName(String name) {
        this.name = name;
    }
    /*obtener peso promedio de la fruta*/
    public float getAverageWeight() {
        return averageWeight;
    }
    /* asignar peso promedio de la fruta*/
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /*obtener color de la fruta*/
    public ArrayList<String> getColors() {
        return colors;
    }
    /* asignar color de la fruta*/
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    //Agregar colores de las frutas
    private ArrayList<String> addColorFruit(){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Verde");
        colors.add("Amarillo");
        return colors;
    }
  
  3. BankAccount
  atributos:accountNumber:int(private),activated:boolean(protected);
  metodos:
  /* obtener numero de cuenta*/
    public int getAccountNumber() {
        return accountNumber;
    }
    /* asignar numero de cuenta*/
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /* obtener activacion */
    public boolean getActivated() {
        return activated;
    }
    /* asignar ativacion*/
    public void isActivated(boolean activated) {
        this.activated = activated;
    }

    public void accountStatus(){
        if(activated == true){
            System.out.println("Cuenta del usuario activa");
        } else {
            System.out.println("Cuenta del usuario inactiva");
        }
  }
  
  4.Book
  atributos:nameBook:String(private),autorName:String(protected),KindOFBook:String(public)
  metodos:
  /* obtener nombre del libro*/
    public String getNameBook() {
        return nameBook;
    }
    /* asignar nombre del libro*/
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    /* obtener nombre del autor*/
    public String getAutorName() {
        return autorName;
    }
    /* asignar nombre del autor*/
    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }
    /* obtener genero del libro*/
    public String getKindOfBook() {
        return kindOfBook;
    }
    /* asignar genero del libro*/
    public void setKindOfBook(String kindOfBook) {
        this.kindOfBook = kindOfBook;
    }
    /*Leer libro*/
    public void readBook(){
        System.out.println("Leyendo el libro: " + getNameBook());
    }
  }
  
  5.Notebook
  atributos:numberOFSheers:int(private),size:String(public),typeOFSheets:String(private);
  metodo:
   /* obtener numero de hojas*/
    public int getNumberOfSheets() {
        return numberOfSheets;
    }
    /* asignar numero de hojas*/
    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }
    /* obtener tamaño*/
    public String getSize() {
        return size;
    }
    /* asignar tamaño*/
    public void setSize(String size) {
        this.size = size;
    }
    /* obtener tipo de hojas*/
    public String getTypeOfSheets() {
        return typeOfSheets;
    }
    /* asignar tipo de hojas*/
    public void setTypeOfSheets(String typeOfSheets) {
        this.typeOfSheets = typeOfSheets;
    }

    public void write(){
        System.out.println("Escribiendo...");
        counterSheets();
    }

    private void counterSheets() {
        numberOfSheets = numberOfSheets -1;
    }

}
  
 6. Dog
  atributos:dogname:String(public),race:String(public),weight:float(public),age:int(public),potenciallyDangerous:boolean(private);
  metodos:
  /* obtener nombre del perro*/
    public String getDogname() {
        return dogname;
    }
    /* asignar nombre del perro*/
    public void setDogname(String dogname) {
        this.dogname = dogname;
    }
    /* obtener raza del perro*/
    public String getRace() {
        return race;
    }
    /* asignar raza del perro*/
    public void setRace(String race) {
        this.race = race;
    }
    /* obtener peso del perro*/
    public float getWeight() {
        return weight;
    }
    /* asignar peso del perro*/
    public void setWeight(float weight) {
        this.weight = weight;
    }
    /* obtener edad del perro*/
    public int getAge() {
        return age;
    }
    /* asignar edad del perro*/
    public void setAge(int age) {
        this.age = age;
    }
    /*perro ladra*/
    public void bark (){
        System.out.println("Guau Guau");
    }
    /*validar si un perro es potencialmente peligroso, clase protegida para usarla en subclases de razas de perro*/
    protected void validateRace(){
        if(race.equals("Rottweiler")){
            System.out.println("Raza potencialmente peligrosa");
            potentiallyDangerous = true; //si la raza es Rottweiler, se cambia el estado a verdadero
        }
    }
  
  

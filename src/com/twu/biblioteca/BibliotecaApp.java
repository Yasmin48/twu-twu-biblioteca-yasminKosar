package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        User[] users = {
                new User("Yasmin","yasmin123","password"),
                new User("Jade","Jade1123","Password")
        };

        LibraryGrid grid = new LibraryGrid(40, 30, 5);
        Library library = new Library();
        Menu menu = new Menu();
        //menu.login(users);
        System.out.println(menu.welcomeMessage());
        System.out.println();
        menu.runMenu(grid, library);


        //System.out.println(library);


        //String response = library.checkoutBook();
        //System.out.println(response); // checked out book not showing on the list;

       // System.out.println(library);


      //  String result = library.checkoutBook();
        //System.out.println(result);

        //System.out.println(library);

//         String returnResponse = library.returnBook();
//         System.out.println(library);
//         System.out.println(returnResponse);

//         String validReturn = library.returnBook(book);
//         System.out.println(library);
//         System.out.println(validReturn);



    }
}

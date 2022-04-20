package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void abstractmethod();

     /*
     abstract methodlar child classlarin mutlaka
     override etmesi gereken methdolardir
     dolayisiyla hic bir zaman direkt calistirilmazlar
     ve bu sebeple method bodysine ihtiyac yoktur

     bir classin veya methodun abstract olup olmadigini anlayabilir miyiz?
     - abstract yaziyorsa abstractir degilse degildir
     (abstract olmayan classlara concrete class/method denir)

     abstract methodlar bodye sahip olamaz
     consrete methodlar ise method body olmadan olusturulamaz
      */


}

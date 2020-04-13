
class AccountTest {
	public static void main(String arg[]) {
	   AccountDetail  AD1=new AccountDetail(1234028004L , "sarvesh"  , 10000);
	   AccountDetail  AD2=new  AccountDetail(13466028985L , "sbm"   , 10001);
	   AccountDetail  AD3=new  AccountDetail(98654056677L , "vij" , 10002);
		System.out.println(AD1.Acctnumber+" "+ AD1.name +" "+ AD1.balance);
	    System.out.println(AD2.Acctnumber+" "+ AD2.name +" "+ AD2.balance);
        System.out.println(AD3.Acctnumber+" "+ AD3.name +" "+ AD3.balance);
}
}

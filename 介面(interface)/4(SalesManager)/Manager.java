package Day7_3;

//注意這裡不是用繼承，而是用實作 Employee
interface Manager extends Employee{
	void work();
	void 規劃();
}
package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();

		System.out.println("Funcionário: " + employee);
		System.out.print("Qual a porcetagem para aumentar o salario?");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		System.out.println("Dados atualizados: " + employee);

		sc.close();
	}
}

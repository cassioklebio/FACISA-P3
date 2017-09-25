package br.com.facisa.p3.pilha;

import static org.junit.Assert.*;

import org.junit.Test;

public class PilhaSequencialTest {

	@Test
	public void test() {
		PilhaSequencial p = new PilhaSequencial();
		p.push("Portuguesa ");
        p.push("Frango com catupiry ");
        p.push("Calabresa ");
        p.push("Quatro queijos ");
        p.push(10);
        
        while (p.isEmpty() == false) {
            System.out.println(p.pop());
	}
	}
}

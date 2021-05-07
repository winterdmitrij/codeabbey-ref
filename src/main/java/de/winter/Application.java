package de.winter;

import de.winter.tasks.Problem001;
import de.winter.tasks.Problem014;
import de.winter.tasks.Problem019;
import de.winter.tasks.Problem023;
import de.winter.tasks.Problem032;
import de.winter.tasks.Problem033;
import de.winter.tasks.Problem034;

public class Application {

	public static void main(String[] args) {
		System.out.println("Programm startet");
		try {
			Application app = new Application();
			app.run();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nProgramm beendet");
		}
	}
	
	public void run() {
		String inputData = "{t[<%>((y)x) <+>]}<y><z>[]<v[*(u)<{t}{z}d>[b]][v]{+}>\n"
				+ "[<u>(d)((v)v)((^)^){%}[-]]< z][u]%{f(+)}{[z]%}>\n"
				+ "{{{g}{y}{v}g}<w><{x}e[[u[/]]/]>([</>v]c)[c]b}{w}<(%)[f<a>]>\n"
				+ "<(-)z<c><d>{f}(g){z}>([f<f>{h}{t}]<%> )(u)<>{e}(<e([v]a)>- <w>\n"
				+ "[{[^][/[v[ < ><u>]]]t}{g}]<u{f}>[v]{+}<*>(z)<c \n"
				+ "[f]([ ]+)(f(w))(v)(h ({v}[[([d]t)/] ])<(^)<d>^>(e)\n"
				+ "(-)[/]<x>[(<f><u>f){ }(a){[{g}([+]w)^]{y}<< >z>e}]\n"
				+ "{+}[[{<z>d}b(w{c})](%)c[g]<f(y{ })<<a>u((v){ }[]]u)[<e>( )d]>>\n"
				+ "[(e)(-)c[{*}a{x}<g[(b))[x]]>]<t>]([a]c)(*[+]\n"
				+ "[{v})](/{c}[^])[{-}(%)[{h{{[[e]a]/}<g>d}} ]]<w>{b}(v [t<y>][h]\n"
				+ "[^]<{b}v>((/)<x>d){{*[e]}e{w}}([c]{t}[x][ ][f]{(f)[+]a})(y{d})(b)\n"
				+ "()(u{[+]y})<<a>f>h}{v}>{u<w{</>[{(-) }({h}c)a]}\n"
				+ "<b><u><{y}[%(+)]a( y>[f<h>(/)]e)>[^][(u)[t]]( [f])\n"
				+ "<{d}[b]<x><g>[{h}e{z}]<b>v[g]>((z)((/)(z)%<<^>[  x>)a)<< >>\n"
				+ "{u}{%}{(<(e)b>(+)^({ }b){a{-}[ ]}(-))[-] }[{*}<[/]%>{d}{b}z</>]()";
		
		Problem019 x = new Problem019();
		
		x.input(inputData);
		x.process();
		x.output();
	}
	
}

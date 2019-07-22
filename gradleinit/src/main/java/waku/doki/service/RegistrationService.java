package waku.doki.service;

public class RegistrationService {
// 強制的にコンフリクトを発せさせるためにtestブランチとmasterブランチに異なる変更を加える
	public void MessageOnConsole(int i) {
		String str = "研修後半頑張りましょう";
		System.out.println(str);
	}
	public int numCount(int i) {
		String str = "研修前半お疲れ様です";
		return i + str.length();

	}
}

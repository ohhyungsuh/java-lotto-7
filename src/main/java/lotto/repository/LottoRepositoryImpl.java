package lotto.repository;

import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoRepositoryImpl implements LottoRepository {
    private static LottoRepository lottoRepository;
    private static List<Lotto> lottoList;

    public static LottoRepository getInstance() {
        if (lottoRepository == null) {
            lottoRepository = new LottoRepositoryImpl();
        }
        return lottoRepository;
    }

    private LottoRepositoryImpl() {
        lottoList = new ArrayList<>();
    }

    @Override
    public List<Lotto> findAllLottoList() {
        return lottoList;
    }

    @Override
    public void addLottoNumbers(List<Integer> lottoNumbers) {
        lottoList.add(new Lotto(lottoNumbers));
    }

}
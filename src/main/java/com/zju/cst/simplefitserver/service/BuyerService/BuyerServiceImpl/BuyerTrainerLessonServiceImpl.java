package com.zju.cst.simplefitserver.service.BuyerService.BuyerServiceImpl;

import com.zju.cst.simplefitserver.model.InfoDetailTrainer;
import com.zju.cst.simplefitserver.model.InfoLesson;
import com.zju.cst.simplefitserver.service.BuyerService.BuyerTrainerLessonService;

import java.util.List;

public class BuyerTrainerLessonServiceImpl implements BuyerTrainerLessonService{
    @Override
    public List<InfoLesson> showAllLessonsByTrainer(InfoDetailTrainer trainer) {
        return null;
    }

    @Override
    public InfoLesson buyOneLesson(InfoDetailTrainer trainer, InfoLesson lesson) {
        return null;
    }

    @Override
    public Integer showRemainNum(InfoLesson lesson) {
        return null;
    }

    @Override
    public Integer showRemainNum(Integer id) {
        return null;
    }
}

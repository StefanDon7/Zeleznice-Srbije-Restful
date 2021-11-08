/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.ZelezniceSrbije.service;

import java.util.List;
import rs.ac.bg.fon.silab.ZelezniceSrbije.domen.Medjustanica;

/**
 *
 * @author Stefan
 */
public interface MedjustanicaService {

     List<Medjustanica> getAll();

     List<Medjustanica> getMedjustaniceByLinijaID(int linijaID);

     Medjustanica add(Medjustanica m);

     int update(Medjustanica m);

     int delete(Medjustanica m);
}

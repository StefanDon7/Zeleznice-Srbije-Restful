/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.ZelezniceSrbije.service;

import java.util.List;
import rs.ac.bg.fon.silab.ZelezniceSrbije.domen.Linija;

/**
 *
 * @author Stefan
 */
public interface LinijaService {

     List<Linija> findAll();

    public void delete(Linija linija);

    public Linija add(Linija linija);
}

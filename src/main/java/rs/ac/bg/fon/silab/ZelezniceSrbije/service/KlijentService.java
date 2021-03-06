/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.ZelezniceSrbije.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.ac.bg.fon.silab.ZelezniceSrbije.domen.Klijent;

/**
 *
 * @author Stefan
 */
@Service
@Transactional
public interface KlijentService {

    List<Klijent> getAllKlijent();

    Klijent getByEmailAndPassword(String email, String password);

    Klijent getKlijentById(int id);

    Klijent addNewKlijent(Klijent klijent);

    String getKlijentByEmail(String email);

    int update(Klijent klijent);

    int updatePassword(Klijent klijent);

    int updateUsername(Klijent klijent);

}

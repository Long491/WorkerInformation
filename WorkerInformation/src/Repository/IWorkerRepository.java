/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.History;
import Model.Worker;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public interface IWorkerRepository {
    
    void addWorker(ArrayList<Worker> lw);
    
    void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status);
    
    void printListHistory(ArrayList<History> lh);
}

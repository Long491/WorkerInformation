/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DateAccess.WorkDao;
import Model.History;
import Model.Worker;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */

public class WorkerRepository implements IWorkerRepository {
   
    @Override
    public void addWorker(ArrayList<Worker> lw) {
        WorkDao.Instance().addWorker(lw);
    }

    @Override
    public void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        WorkDao.Instance().changeSalary(lw, lh, status);
    }

    @Override
    public void printListHistory(ArrayList<History> lh) {
        WorkDao.Instance().printListHistory(lh);
    }
}
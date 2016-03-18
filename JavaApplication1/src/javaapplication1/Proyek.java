/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author Windows 8.1 Pro
 */
public class Proyek {
      private Programmer[] programmer;
    private Tugas[] tugas;
    private int jumlahProgrammer;
    private int maksimalProgrammer;
    private int maksimalTugas;
    private Date deadline;
    private int jumlahTugas;

    public Proyek(int maksimalProgrammer, int maksimalTugas, Date deadline) {
        this.maksimalProgrammer = maksimalProgrammer;
        this.maksimalTugas = maksimalTugas;
        this.deadline = deadline;
        programmer = new Programmer[maksimalProgrammer];
        tugas = new Tugas[maksimalTugas];
    }

    public void addProgrammer(Programmer p) {
        if (jumlahProgrammer <= programmer.length) {
            programmer[jumlahProgrammer] = p;
            jumlahProgrammer++;
        } else {
            System.out.println("Tidak bisa ditambah lagi");
        }
    }

    public Programmer getProgrammer(int index) {
        return programmer[index];
    }

    public void createTugas(String namaTugas) {
        if (jumlahTugas <= tugas.length) {
            tugas[jumlahTugas] = new Tugas(namaTugas);
            jumlahTugas++;
        } else {
            System.out.println("Tidak bisa ditambah lagi");
        }
    }

    public Tugas getTugas(int index) {
        return tugas[index];
    }

    public void removeProgrammer(int index) {
        if ((index < programmer.length) && (index >= 0)) {
            for (int i = index; i < programmer.length; i++) {
                programmer[i] = programmer[i + 1];
            }
            programmer[jumlahProgrammer - 1] = null;
            jumlahProgrammer--;
            System.out.println("Programmer Berhasil di remove");
        }
    }

    public void removeTugas(int index) {
        if ((index < programmer.length) && (index >= 0)) {
            for (int i = index; i < tugas.length; i++) {
                tugas[i] = tugas[i + 1];
            }
            tugas[jumlahTugas - 1] = null;
           jumlahTugas--;
            System.out.println("Tugas Berhasil di remove");
        }
    }
}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ArrayList.h
 * Author: Chad
 *
 * Created on April 15, 2016, 1:04 AM
 */

#ifndef ARRAYLIST_H
#define ARRAYLIST_H

class ArrayList {
public:
    ArrayList();
    ArrayList(const ArrayList& orig);
    virtual ~ArrayList();
    void push_back(int);
    void erase(int);
    int size();
    toString();
private:

};

#endif /* ARRAYLIST_H */


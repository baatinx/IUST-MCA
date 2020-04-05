.model small
.stack 100H
.data
        c db 'A'
        entr db 13
                                                             
.code
        mov ax,@data
        mov ds,ax                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

lbl1:   mov dl,c
        mov ah,02h
        int 21h

        mov dl,entr
        mov ah,02h
        int 21h

        inc c

        cmp c,90
        jbe lbl1

        mov ah,4ch
        int 21h
end        


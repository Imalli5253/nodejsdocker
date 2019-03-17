---
- hosts: all
  become: yes
  roles:
    - geerlingguy.nodejs
  tasks:
  - name: Copy war file
    copy:
      src:
      dest: